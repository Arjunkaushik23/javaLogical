package string;

import java.util.Map;

public class HashMap {

    public static void main(String[] args) {

        java.util.HashMap<String, String> map = new java.util.HashMap<>();
        map.put("1","Arjun");
        map.put("2","Kartik");
        map.put("3","Honor");
        map.put("4","Michael");


//        System.out.println("Kartik's sr number is " + map.get("2"));

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


        // Get the key from the value

        String studentSrNumber = null;
        for (Map.Entry<String, String> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " = " + entry.getValue());
            if (entry.getValue().equals("Kartik")){
//                studentSrNumber=entry.getKey();
                System.out.println("Kartik is having "+ entry.getKey()+" SR. number");
//                break;
            }
        }

//        if (studentSrNumber != null){
//
//        }else{
//        System.out.println("Not present");
//        }

    }
}
