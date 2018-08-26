package Completetasks;

public class Stringram {

    public static void main(String[] args){
        String s = "ramadurgamanikanttadurgaramamanirama";
        String ss = "ram";
        //System.out.println(ss.length());
        int x = s.length();
        int y = s.replaceAll(ss,"").length();
        int z = (x-y)/ss.length();
        System.out.println("Total Number of RAM'S are "  + z );






//        int count = s.split("ram").length-1;
//
//        System.out.println(count);



//        for (int i = 0; i <s.length() ; i++) {
//            if (s.contains("ram")) {
//                count ++;
//            }
//            System.out.println("count : " + count);

//        char[] raj = s.toCharArray();
//
//
//
//        String[] r = s.split("ram");
//        int count = 0;
//        for (int i = 0; i <r.length ; i++) {
//            if (r[i].equals("ram")) {
//                count++;
//            }
//            System.out.println(count);
            // }



    }
}
