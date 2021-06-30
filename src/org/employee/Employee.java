package org.employee;

public class Employee {
	public static void main(String[] args) {
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=1; j++) {
			System.out.println(j);	
				
			}
		
			
		}
	}

}

// 1     //2      //3.1 o/p    3.2      //4      //5  o/p    //j=j+1    i++
//i=0    0<3     t     0       j=0        0<3     t    0      j=1  
//                             j=1        1<3      t    1     j=2
//                             j=2        2<3      t    2     j=3
//                             j<3        3<3      f                    i=1 execution
// i=1   1<3     t      1      j=0        0<3      t    0     j=1    
                             //j=1        1<3      t    1     j=2
//                             j=2        2<3      t    2     j=3
//                             j=3        3<3   false                  i=2
// i=2  2<3      t     2       j=0        0<3      t    0      j=1  
//                             j=1        1<3      t    1     j=2
//                             j=2        2<3      t    2     j=3
//                             j=3        3<3   false                 i=3
                        
//i=3  3<3   terminate loop;