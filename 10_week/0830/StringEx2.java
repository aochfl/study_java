package _0830;
/*
sam smith - i'm not the only one 노래의 가사를 가져와서 노래중에 a 가 몇개나오나?

I’m Not the Only One
Sam Smith
You and me we made a vow
For better or for worse
I can't believe you let me down
But the proof is in the way it hurts
For months on end I've had my doubts
Denying every tear
I wish this would be over now
But I know that I still need you here
You say I'm crazy
'Cause you don't think I know what you've done
But when you call me baby
I know I'm not the only one
You've been so unavailable
Now sadly I know why
Your heart is unobtainable
Even though Lord knows you kept mine
You say I'm crazy
'Cause you don't think I know what you've done
But when you call me baby
I know I'm not the only one
I have loved you for many years
Maybe I am just not enough
You've made me realize my deepest fear
By lying and tearing us up
You say I'm crazy
'Cause you don't think I know what…*/
public class StringEx2 {
	public static void main(String[] args) {
		// sam smith - i'm not the only one 노래의 가사를 가져와서 노래중에 a 가 몇개나오나?
		String lylic =  "I’m Not the Only One"+
						"Sam Smith"+
						"You and me we made a vow"+
						"For better or for worse"+
						"I can't believe you let me down"+
						"But the proof is in the way it hurts"+
						"For months on end I've had my doubts"+
						"Denying every tear"+
						"I wish this would be over now"+
						"But I know that I still need you here"+
						"You say I'm crazy"+
						"'Cause you don't think I know what you've done"+
						"But when you call me baby"+
						"I know I'm not the only one"+
						"You've been so unavailable"+
						"Now sadly I know why"+
						"Your heart is unobtainable"+
						"Even though Lord knows you kept mine"+
						"You say I'm crazy"+
						"'Cause you don't think I know what you've done"+
						"But when you call me baby"+
						"I know I'm not the only one"+
						"I have loved you for many years"+
						"Maybe I am just not enough"+
						"You've made me realize my deepest fear"+
						"By lying and tearing us up"+
						"You say I'm crazy"+
						"'Cause you don't think I know what…";

		{
			int count = 0;
			long time1 = System.nanoTime();
			for(int index = 0 ; index < lylic.length() ; index++) 
			{
				if(lylic.charAt(index) == 'a') count++;
			}
			long time2 = System.nanoTime();
			System.out.println(time2-time1+"초 소요 / 갯수 :"+count);
		}
		{
			long time1 = System.nanoTime();
			int count = lylic.split("a").length -1;
			long time2 = System.nanoTime();
			System.out.println(time2-time1+"초 소요 / 갯수 :"+count);
		}
	}
}
