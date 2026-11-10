public class Assignment01Q04 {
    public static int[] shiftArrayCyclic(int[] arr, int step, char d){
        if (arr.length == 0) {return arr;}
        step = step % arr.length;
        if (step == 0 || (d != 'R' && d!= 'L')) { return arr;}
        if (d == 'R' && step > 0 || d == 'L' && step < 0 ){
            return move_right(arr, Math.abs(step));
        }
        else{
            return move_right(arr, arr.length - Math.abs(step));
        }
    }
    public static int [] move_right(int[] arr, int step){
        int[] temp = new int[step];
        int j = 0;
        for(int  i = arr.length - step; i < arr.length; i++){
            temp[j] = arr[i];
            j++;
        }
        int [] res = new int[arr.length];
        for (int i = 0; i < step; i++){
            res[i] = temp[i];
        }
        j = 0;
        for (int i = step; i < res.length; i++){
            res[i] = arr[j];
            j++;
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = res[i];
        }
        return arr;
        
    }
    public static void main(String[] args) {
    // בדיקה 1: הזזה רגילה ימינה
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(java.util.Arrays.toString(shiftArrayCyclic(arr1, 2, 'R')));

    // בדיקה 2: מערך ריק (המקרה שתיקנו עם השגיאת חלוקה באפס)
        int[] arr2 = {};
        System.out.println(java.util.Arrays.toString(shiftArrayCyclic(arr2, 3, 'R')));

    // בדיקה 3: כיוון שמאלה עם צעד גדול מגודל המערך
        int[] arr3 = {10, 20, 30};
        System.out.println(java.util.Arrays.toString(shiftArrayCyclic(arr3, -4, 'L')));
}
    
}   

    
