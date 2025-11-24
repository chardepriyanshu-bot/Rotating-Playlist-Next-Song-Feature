/*
 * Ques - 5
--------------
Rotating Playlist – Next Song Feature

A music app stores the playlist as:
[10,20,30,40,50]
When the user presses Next, the playlist rotates left by 1:
Output:
[20,30,40,50,10]
 */

package lab.array;

import java.util.Arrays;

public class RotatingPlaylist {

	public static int[] rotate(int list[]) {
		int temp=0;
		temp=list[0];
		for (int i=0;i<list.length-1;i++) {
			
			list[i]=list[i+1];
		}
		list[list.length-1]=temp;
		return list;
	}
	public static void main(String[] args) {
		int [] list= {10,20,30,40,50};
		System.out.println(Arrays.toString(rotate(list)));
	}

}
