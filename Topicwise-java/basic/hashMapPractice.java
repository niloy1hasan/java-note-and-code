import java.util.HashMap;

public class hashMapPractice {
    public static void main(String[] args){
        HashMap<String, String> CitiesName = new HashMap<String,String>();

        CitiesName.put("Bangladesh", "Dhaka");
        CitiesName.put("India", "New Delhi");
        CitiesName.put("Pakistan", "Islamabad");
        CitiesName.put("Nepal", "kathmandu");
        CitiesName.put("maldives", "Male");
        CitiesName.put("Thailand", "Bangkok");
        CitiesName.put("Bhutan", "Thimpu");
        CitiesName.put("Saudi Arabia", "Riyad");

        System.out.println(CitiesName);

        System.out.println(CitiesName.get("Thailand"));
        CitiesName.remove("India");
        System.out.println(CitiesName);


        int size = CitiesName.size();

        System.out.println(size);

        for(String i: CitiesName.keySet()){
            System.out.println(i);
        }

        for(String i: CitiesName.values()){
            System.out.println(i);
        }

    }
}
