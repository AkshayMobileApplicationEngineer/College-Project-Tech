import java.util.HashMap;
import java.util.Scanner;

public class DiseaseToVegetable {
    static String disease;
    static String ResultgetVegetable;
    public String getVegetable(String disease) {
        HashMap<String, String> diseaseToVegetable = new HashMap<String, String>();
        diseaseToVegetable.put("Fungal infection", "Asparagus");
        diseaseToVegetable.put("Allergy", "Spinach");
        diseaseToVegetable.put("GERD", "Spinach");
        diseaseToVegetable.put("Chronic cholestasis", "Spinach");


        // if(diseaseToVegetable.get(disease) == null) {
        //     return "No Vegetable";
        // }

        if(diseaseToVegetable.containsKey(disease)) {
            return diseaseToVegetable.get(disease);
        } else {
            return "No Vegetable";
        }
        
    }
 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the disease");
        System.out.println("Fungal infection");
        System.out.println("Allergy");
        System.out.println("GERD");
        System.out.println("Chronic cholestasis");
         disease = sc.nextLine();
        DiseaseToVegetable d = new DiseaseToVegetable();
        ResultgetVegetable=d.getVegetable(disease);
        System.out.println("Vegetable: " + ResultgetVegetable);
        sc.close();
    }
}