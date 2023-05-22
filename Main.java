public class Main {
    public static void main(String[] args) {
        int[] sampleData = {1,2,1,3,4,2,5};

        int[] result = removedublated(sampleData);

        for (int s = 0; s < result.length; s++){
            System.out.println(result[s]);
        }
    }

    static int [] removedublated(int[] givenArray){
        if (givenArray == null || givenArray.length == 0){
            return givenArray;
        }
        else{
            int [] output = new int[givenArray.length];
            int counter = 0;

            boolean isdupulicate = false;
            for (int i = 0; i < givenArray.length; i++){
                isdupulicate = false;
                for(int j = 0; j < output.length; j++){
                    if(givenArray[i] == output[j]){
                        isdupulicate = true;
                        break;
                    }
                }
                if(isdupulicate == false){
                    output[counter] = givenArray[i];
                    counter++;
                }

            }

            if (counter == output.length){
                return output;
            }
            else{
                int[] fliterOutput = new int[counter];

                for (int x = 0; x < fliterOutput.length; x++){
                    fliterOutput[x] = output[x];
                }
                return fliterOutput;
            }
        }
    }
}