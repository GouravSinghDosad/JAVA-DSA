class Solution {
    public int calPoints(String[] operations) {
        
        ArrayList<String> myList = new ArrayList<>();

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+") ){

                int one = Integer.parseInt(myList.get(myList.size()-1));
                int two = Integer.parseInt(myList.get(myList.size()-2));
                String three = String.valueOf(one+two);
                myList.add(three);

            }else if(operations[i].equals("D")){
                int four = 2*Integer.parseInt(myList.get(myList.size()-1));
                String five = String.valueOf(four);
                myList.add(five);
            }else if(operations[i].equals("C") ){

                myList.remove(myList.size()-1);
            
            }else{
                myList.add(operations[i]);
            }
        }

        int sum = 0;
        for(String num: myList){
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}