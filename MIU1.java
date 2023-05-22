public class MIU1 {
    public static void main (String[] args){
        int [] sampledata = {1,2,1,3,4,2,5};

        int [] result = removeduplicated(sampledata);

        for(int s = 0; s < result.length; s++){
            System.out.println(result[s]);
        }
    }

    static int[] removeduplicated(int [] givendata){
        if(givendata == null || givendata.length == 0){
            return givendata;
        }
        else {
            int [] output = new int[givendata.length];

            int counter = 0;
            boolean isduplicated = false;
            for (int i = 0; i<givendata.length; i++) {
                isduplicated = false;
                for (int j = 0; j < output.length; j++) {
                    if (givendata[i] == output[j]) {
                        isduplicated = true;
                        break;
                    }
                }
                if (isduplicated == false) {
                    output[counter] = givendata[i];
                    counter++;
                }
            }

                if(counter == output.length){
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
