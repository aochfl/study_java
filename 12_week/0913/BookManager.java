package _0913;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class BookInfo {
	static String[] infoName = { "제목", "ISBN", "가격", "글쓴이", "발행년도" };

	static enum infoType {
		name, isbn, price, writer, year
	}

	String name, isbn, price, writer, year;

	public BookInfo(String _name, String _isbn, String _price, String _writer, String _year) {
		name = _name;
		isbn = _isbn;
		price = _price;
		writer = _writer;
		year = _year;
	}

	public String getBookInfo(String separator) {
		String temp = "";

		temp += name + separator;
		temp += isbn + separator;
		temp += price + separator;
		temp += writer + separator;
		temp += year + separator;

		return temp;
	}
}

class BookList {
	private File f;
	private HashMap<Integer, BookInfo> bookList;

	BookList() {
		f = new File("./src/_0913/bookList.txt");
		bookList = new HashMap<>();

		loadList();
	}

	public void loadList() {
		bookList.clear();

		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {// 한줄씩 읽어온다. null이 아닐때까지
				String[] lineData = line.split("/");// /로 잘라서 배열에 담는다

				int number = Integer.parseInt(lineData[0]);
				String name = lineData[1];
				String isbn = lineData[2];
				String price = lineData[3];
				String writer = lineData[4];
				String year = lineData[5];

				bookList.put(number, new BookInfo(name, isbn, price, writer, year));
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}

	public void saveList(BookInfo book) {
		bookList.put(bookList.size() + 1, book);

		FileWriter fw;
		try {
			fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);

			String temp = "";
			temp += (bookList.size()) + "/";
			temp += book.getBookInfo("/");

			pw.println(temp);
			pw.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<BookInfo> searchBookList(BookInfo.infoType type, String keyword) {
		return searchBookList(type.ordinal(), keyword);
	}

	public ArrayList<BookInfo> searchBookList(int type, String keyword) {
		ArrayList<BookInfo> result = new ArrayList<>();

		Set<Integer> keySet = bookList.keySet();
		Iterator<Integer> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			Integer key = keyIterator.next();
			BookInfo value = bookList.get(key);

			boolean addItem = false;
			switch (type) {
			case 0:
				if (value.name.contains(keyword))
					addItem = true;
				break;
			case 1:
				if (value.isbn.contains(keyword))
					addItem = true;
				break;
			case 2:
				if (value.price.contains(keyword))
					addItem = true;
				break;
			case 3:
				if (value.writer.contains(keyword))
					addItem = true;
				break;
			case 4:
				if (value.year.contains(keyword))
					addItem = true;
				break;
			}
			if (addItem)
				result.add(value);
		}

		return result;
	}

}

class SearchPanel extends JPanel implements ActionListener {
	JComboBox<String> searchCombo;
	JTextField tfSearch;
	JTable resultList;
	JButton btnSearch;
	DefaultTableModel model;

	BookList bookList;

	public SearchPanel(BookList _bookList) {
		bookList = _bookList;
		JPanel pnl = new JPanel();
		searchCombo = new JComboBox<>(BookInfo.infoName);
		pnl.add(searchCombo);

		tfSearch = new JTextField(10);
		pnl.add(tfSearch);

		btnSearch = new JButton("검색");
		btnSearch.addActionListener(this);
		pnl.add(btnSearch);
		this.add(pnl);

		model = new DefaultTableModel(BookInfo.infoName, 0);
		resultList = new JTable(model);
		model.addRow(BookInfo.infoName);
		this.add(resultList);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSearch) {
			while (model.getRowCount() != 1)
				model.removeRow(1);
			String searchText = tfSearch.getText();
			int type = searchCombo.getSelectedIndex();
			System.out.println(type);

			ArrayList<BookInfo> list = bookList.searchBookList(type, searchText);

			for (int i = 0; i < list.size(); i++) {
				String[] item = { list.get(i).name, list.get(i).isbn, list.get(i).price, list.get(i).writer,
						list.get(i).year };
				model.addRow(item);
			}
		}
	}
}

class InputPanel extends JPanel implements ActionListener {
	JTextField tfName, tfISBN, tfPrice, tfWriter, tfYear;
	JTextField[] tfList;
	JButton btnSave;

	BookList bookList;

	public InputPanel(BookList _bookList) {
		bookList = _bookList;

		tfList = new JTextField[5];
		tfList[0] = tfName = new JTextField(10);
		tfList[1] = tfISBN = new JTextField(10);
		tfList[2] = tfPrice = new JTextField(10);
		tfList[3] = tfWriter = new JTextField(10);
		tfList[4] = tfYear = new JTextField(10);

		this.setLayout(new GridLayout(0, 1));
		for (int i = 0; i < tfList.length; i++) {
			JPanel pnl = new JPanel();
			pnl.setLayout(null);

			JLabel label = new JLabel(BookInfo.infoName[i]);
			label.setLocation(5, 0);
			label.setSize(50, 25);
			pnl.add(label);

			tfList[i].setLocation(75, 0);
			tfList[i].setSize(150, 25);
			pnl.add(tfList[i]);

			this.add(pnl);
		}

		btnSave = new JButton("저장");
		btnSave.addActionListener(this);
		this.add(btnSave);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSave) {
			boolean isBlank = false;
			for (int i = 0; i < tfList.length; i++) {
				if (tfList[i].getText().equals("")) {
					isBlank = true;
				}
			}
			if (isBlank) {
				JOptionPane.showMessageDialog(null, "책정보가 모두 입력되지 않았습니다");
			} else {
				bookList.saveList(new BookInfo(tfName.getText(), tfISBN.getText(), tfPrice.getText(),
						tfWriter.getText(), tfYear.getText()));
			}
		}
	}
}

public class BookManager extends JFrame {
	BookList bookList = new BookList();

	public BookManager() {
		this.setSize(400, 500);
		this.setDefaultCloseOperation(3);
		this.setLayout(new GridLayout(0, 1));

		this.add(new InputPanel(bookList));
		this.add(new SearchPanel(bookList));

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new BookManager();
	}
}
