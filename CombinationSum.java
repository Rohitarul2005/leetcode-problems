public class combinationSum{
    public static void combinationSum(int[] candidates, int target) {
        int[] combination = new int[target]; 
        combinationmethod(candidates, target, 0, 0, combination);
    }
    
    public static void combinationmethod(int[] candidates, int target, int start, int index, int[] combination) {
        if (target == 0) {
            for (int i = 0; i < index; i++) {
                System.out.print(combination[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                combination[index] = candidates[i]; 
                combinationmethod(candidates, target - candidates[i], i, index + 1, combination); 
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        combinationSum(candidates, target);
    }
}