package practice.programmers.level_2;

import java.util.Arrays;

public class Practice_lessons_17686 {
	public static void main(String[] args) {
		// Test Case
//		String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		String[] files = {"img.png", "Img1.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		
		// Answer
		Practice_lessons_17686 main = new Practice_lessons_17686();
		System.out.println(Arrays.toString(main.solution(files)));
		
	}
	
	public String[] solution(String[] files) {
		Arrays.sort(files, (o1, o2) -> {
            String head1 = getHead(o1.toString());
            String head2 = getHead(o2.toString());
            
            System.out.println(head1 + "" + head2);
            
            return 1;
        });
		
		return null;
    }
    
    public String getHead(String str) {
        int idx = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                idx = i;
                break;
            }
        }
        return str.substring(idx);
    }
	/*
	public String[] solution(String[] files) {
        Arrays.sort(files, (o1, o2) -> {
            String[] str1 = partition(o1.toString());
            String[] str2 = partition(o2.toString());

            int headCompare = str1[0].compareTo(str2[0]);
            int numCompare = Integer.parseInt(str1[1]) - Integer.parseInt(str2[1]);

            if (headCompare == 0) {
                if (numCompare == 0) {
                    return 0;
                }
                return numCompare;
            }
            return headCompare;

        });

        return files;
    }

    //return String[head, mid, tail]
    public String[] partition(String file) {
        String[] partition = new String[3];
        int numIdx = -1;
        boolean numFlag = false;

        for (int i = 0; i < file.length(); i++) {
            if (!numFlag && Character.isDigit(file.charAt(i))) {
                numIdx = i;
                numFlag = true;
                partition[0] = file.substring(0, i).toUpperCase();

            } else if (numFlag && !Character.isDigit(file.charAt(i))) {
                String num = file.substring(numIdx, i);

                if (num.length() > 5) {
                    i = i - num.length() - 5;
                }

                partition[1] = file.substring(numIdx, i);
                partition[2] = file.substring(i);
                break;
            }
        }

        //숫자를 하나 이상 포함.
        if (partition[1] == null) {
            int tailStartIdx = file.length();
            String num = file.substring(numIdx, tailStartIdx);

            if (num.length() > 5) {
                tailStartIdx = tailStartIdx - num.length() - 5;
            }

            partition[1] = file.substring(numIdx, tailStartIdx);
            partition[2] = file.substring(tailStartIdx);
        }

        return partition;
    }
    */
}


















