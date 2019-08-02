import java.util.*;
interface MyString{
Boolean isPalindrome(String str);
}


interface Vowel{
default int count(String str){
int num=0;
for(int i=0;i<str.length(); i++){
char c = str.charAt(i);
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
	num = num+1;
}
}
return num;
}
}

interface Consonent{
default int count(String str){
int num=0;
for(int i=0;i<str.length(); i++){
char c = str.charAt(i);
if(c!='a' || c!='e' || c!='i' || c!='o' || c!='u'){
	num = num+1;
}
}
return num;
}
}



class Demo implements MyString, Vowel,Consonent{

public Boolean isPalindrome(String str){
System.out.println("It is a palindrome");
}

class Demo1{
void readString(){
String str;
Scanner sc = new Scanner(System.in);
str = sc.nextLine();
}
}

public int count(String str){
	Vowel.super.count(str);
	Consonent.super.count(str);
}

public static void main(String [] args){
Demo a1 = new Demo();
Demo.Demo1 b1 =a1.new Demo1();
MyString m1 = new Demo();
b1.readString();
m1.ispalindrome();
a1.count("Hello");
}
}
