/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringrev;


 class Stringrev{
     
    public static void main(String args[]){
    String str[] = "He is the one".split(" ");
    String finalStr="";
        for(int i = str.length-1; i>= 0 ;i--){
            finalStr += str[i]+" ";
        }
        System.out.println(finalStr);
    }
}