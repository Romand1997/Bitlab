package Ch6;

import java.util.Scanner;

public class Ch6task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        a =a+ " + ";
        String a1[] = a.split("\\s");
        int last = 0;
        boolean flag = false;
        String ans = "";
        for (int i = 1; i < a1.length - 1; i=i+1) {
            if (a1[i].equals("/")) {
                if (flag) {
                    last = last / Integer.parseInt(a1[i + 1]);
                } else {
                    last = Integer.parseInt(a1[i - 1]) / Integer.parseInt(a1[i + 1]);
                    flag = true;
                }
            //    i++;
            } else if (a1[i].equals("*")) {
                if (flag) {
                    last = last * Integer.parseInt(a1[i + 1]);
                } else {
                    last = Integer.parseInt(a1[i - 1]) * Integer.parseInt(a1[i + 1]);
                    flag = true;
                }
              //  i++;
            } else if (a1[i].equals("+") || a1[i].equals("-")) {
                if (!flag)
                    ans = ans + a1[i-1] + " " + a1[i]  + " ";
                else
                    ans = ans + String.valueOf(last) + " " + a1[i] +  " ";
                    flag = false;
                //ans = ans + String.valueOf(last) + " " + a1[i] + " ";
            }
        }
        if (a1[a1.length - 1].equals("+") || a1[a1.length - 1].equals("-")) {
            if (!flag)
                ans = ans + a1[a1.length - 2] + " ";
            else
                ans = ans + String.valueOf(last) + " ";
        }

        if (ans.contains("+")||ans.contains("-")) {
            last = 0;
            a1 = ans.split("\\s");
            flag = true;
            for (int i = 1; i < a1.length - 1; i++) {
                if (a1[i].equals("+")) {
                    if (flag) {
                        last = Integer.parseInt(a1[i - 1]) + Integer.parseInt(a1[i + 1]);
                        flag = false;
                    } else {
                        last = last + Integer.parseInt(a1[i + 1]);
                    }
                }
                if (a1[i].equals("-")) {
                    if (flag) {
                        last = Integer.parseInt(a1[i - 1]) - Integer.parseInt(a1[i + 1]);
                        flag = false;
                    } else {
                        last = last - Integer.parseInt(a1[i + 1]);
                    }
                }
            }
            System.out.println(last);
        } else {
            System.out.println(ans);
        }
    }
}
   // Создайте калькулятор который принимает несколько чисел с математическими
// операторами (+, -, * , /) и выдает результат операции.








// 4 / 4 + 4 - 4 / 4 + 3

























//
//package Ch6;
//
//        import java.util.Scanner;
//
//public class Ch6task29 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String a = in.nextLine();
//        a += " + ";
//        String a1[] = a.split("\\s");
//        int last = 0;
//        boolean flag = false;
//        String ans = "";
//        for(int j=0;j<a.length();j++) {
//            if (String.valueOf(a.charAt(j)).equals("/") || String.valueOf(a.charAt(j)).equals("*")) {
//                while (a1[j].equals("+") || a1[j].equals("-")) {
//                    j++;
//                    for (int i = j; i < a1.length - 1; i++) {
//                        if (a1[i].equals("/")) {
//                            if (flag) {
//                                last = last / Integer.parseInt(a1[i + 1]);
//                            } else {
//                                last = Integer.parseInt(a1[i - 1]) / Integer.parseInt(a1[i + 1]);
//                                flag = true;
//                            }
//                            i++;
//                        } else if (a1[i].equals("*")) {
//                            if (flag) {
//                                last = last * Integer.parseInt(a1[i + 1]);
//                            } else {
//                                last = Integer.parseInt(a1[i - 1]) * Integer.parseInt(a1[i + 1]);
//                                flag = true;
//                            }
//                            i++;
//                        } else if (a1[i].equals("+") || a1[i].equals("-")) {
//                            flag = false;
//                            ans = ans + String.valueOf(last) + " " + a1[i] + " ";
//                        }
//                    }
//                    if (a1[a1.length - 1].equals("+") || a1[a1.length - 1].equals("-")) {
//                        if (!flag)
//                            ans = ans + a1[a1.length - 2] + " ";
//                        else
//                            ans = ans + String.valueOf(last) + " ";
//
//                    }
//                }
//            }
//        }
//        System.out.println(ans);
//// 5/5*6 + 4*6
////            for (int i = 0; i < ans.length(); i++) {
////                System.out.println(ans.charAt(i));
////            }
////        for(int i=0;i<a1.length-2;i++){
////             if(a1[i+1].equals("*")) {
////                 itog =itog*Integer.parseInt(a1[i]) * Integer.parseInt(a1[i + 2]);
////                 a1[i] = a1[i + 2] = String.valueOf(itog);
////             }
////        }
////                for(int i=0;i<a1.length-2;i++){
////                    if(a1[i+1].equals("-")) {
////                        itog = Integer.parseInt(a1[i]) - Integer.parseInt(a1[i + 2]);
////                        a1[i] = a1[i + 2] = String.valueOf(itog);
////                    }
////                }
//
//
//        // System.out.println(itog);
//    }
//}
//
//
//
//// Создайте калькулятор который принимает несколько чисел с математическими
//// операторами (+, -, * , /) и выдает результат операции.



































