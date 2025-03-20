public class UniqueElementInArray {

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 3, 2};
        int uniqueElement = -1; // Initialize with -1 to indicate no unique element found

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break; // No need to check further if a duplicate is found
                }
            }

            if (isUnique) {
                uniqueElement = arr[i];
                break; // Exit once the first unique element is found
            }
        }

        if (uniqueElement == -1) {
            System.out.println("No Unique Element Found");
        } else {
            System.out.println("Unique Element in an Array is: " + uniqueElement);
        }
    }
}
