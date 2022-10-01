/**
 * 
 */
package javaObjectClass;

/**
 * @author LSPL313
 *
 */
class CopyValueWithoutConstructor{  
    int id;  
    String name;  
    CopyValueWithoutConstructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    CopyValueWithoutConstructor(){}  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    	CopyValueWithoutConstructor s1 = new CopyValueWithoutConstructor(111,"Karan");  
    	CopyValueWithoutConstructor s2 = new CopyValueWithoutConstructor();  
    s2.id=s1.id;  
    s2.name=s1.name;  
    s1.display();  
    s2.display();  
   }  
}