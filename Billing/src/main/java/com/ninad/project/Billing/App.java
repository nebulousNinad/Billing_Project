package com.ninad.project.Billing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.ninad.project.models.Bill;
import com.ninad.project.models.Customer;
import com.ninad.project.models.EmployeeEntity;
import com.ninad.project.models.Product;
import com.ninad.project.models.Transaction;
import com.ninad.project.models.User;
import com.ninad.project.serviceImpl.billServiceImpl;
import com.ninad.project.serviceImpl.customerServiceImpl;
import com.ninad.project.serviceImpl.productServiceImpl;
import com.ninad.project.serviceImpl.userServiceImpl;
import com.ninad.project.utility.SessionFactoryUtil;
import com.ninad.project.utility.verifyPassword;

/**
 * Hello world!
 *
 */
public class App 
{
	int globalvariable;
	
    public static void main( String[] args ) throws IOException
    {    
    	
    	
    	//starting DEV branch...
    	
    	
    	userServiceImpl UserService = new userServiceImpl();
    	productServiceImpl ProductService = new productServiceImpl();
    	billServiceImpl BillService = new billServiceImpl();
    	customerServiceImpl CustomerService = new customerServiceImpl();
    	
    	SessionFactory sf =SessionFactoryUtil.sessionFactory();
    	sf.openSession().save(new EmployeeEntity());
    	  Scanner s = new Scanner(System.in);
          BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
    	int option;
    	
    	String username;
    	String password="";
    	
    	
    	System.out.println("Enter Bill id ");
    	int billid =Integer.parseInt(br.readLine());
    	Bill mybill = BillService.getBill(billid);
    	System.out.println(mybill);
    	System.out.println(mybill.getTransaction());
    	System.out.println(mybill.getTransaction().getProdqty().size());
       
         
      
            if(true)
            	return;
            
            System.out.println("controll returned..");
            System.out.println( "Select from following Options" );
            
            System.out.println( "1.Login ");
        option=  Integer.parseInt(s.nextLine());
        
        
       
       
       switch (option) {
       
       case 1 : {
    	   System.out.println("Enter Username : ");
    	   username = s.nextLine();
    	   System.out.println("Enter User Password : ");
    	   password = s.nextLine();
    	   
    	   if (verifyPassword.verify(username, password))//
    	   {
    		   int op ;
    		   System.out.println( "\n1.Users \n2.Product \n3.Custmr \n4.Bill ");
    		   op=  Integer.parseInt(s.nextLine());
    		   
    		   switch (op) {
    		   case 1 : {    
    			              int myop;
    			             System.out.println("1.Add 2.Delete 3.UserInfo 4.Update");
    			             myop=  s.nextInt();
    			             
    			             switch (myop){
    			             
    			             case 1 : {   //adding user
    			            	        
    			            	         Scanner s1 = new Scanner(System.in);
    			            	         String uname ,pwd ,roll , city ;
    			            	         int sal;
    			            	         
    			            	         System.out.println("Enter username ");
    			            	         uname = s1.nextLine();
    			            	         
    			            	         System.out.println("Enter pwd");
    			            	         pwd = s1.nextLine();
    			            	         
    			            	         System.out.println("Enter roll");
    			            	         roll = s1.nextLine();
    			            	         
    			            	         System.out.println("Enter city");
    			            	         city = s1.nextLine();
    			            	         
    			            	         System.out.println("Enter salary");
    			            	         sal = s1.nextInt();
    			            	         
    			            	         User user = new User(uname, pwd, roll, sal, city);
    			            	         UserService.addUser(user);
    			            	         
    			            	         System.out.println("User Added Successfully.. uname= "+uname+ "pwd= "+pwd);
    			            	         break;
    			                      }
    			             
    			             case 3: {      int uid;
                                            System.out.println("Enter Userid :");
                                            uid =s.nextInt();
                                            
                                            User u =UserService.getuser(uid);
                                            
                                            
                                            System.out.println(u);
    			                     }
    			             
    			             
    			             case 4 : {      int myid;
    			            	             System.out.println("Enter userid to be updated");
    			            	              myid = Integer.parseInt(br.readLine());
    			            	              
    			            	              User user = UserService.getuser(myid);
    			            	              
    			            	              System.out.println("This is the user You want to be updated");    			            	            
                                                                                         
                                              System.out.println(user);
                                            
                                              String uname ,pwd ,roll , city ;
       			            	              int sal;
       			            	         
       			            	         System.out.println("Enter username ");
       			            	         uname = br.readLine();
       			            	         
       			            	         System.out.println("Enter pwd");
       			            	         pwd =  br.readLine();
       			            	         
       			            	         System.out.println("Enter roll");
       			            	         roll =  br.readLine();
       			            	         
       			            	         System.out.println("Enter city");
       			            	         city =  br.readLine();
       			            	         
       			            	         System.out.println("Enter salary");
       			            	         sal = Integer.parseInt(br.readLine());
    			            	              
       			            	         user.setSalary(sal);
       			            	         user.setCity(city);
       			            	         user.setRoll(roll);
       			            	         user.setPassword(pwd);
       			            	         user.setUserName(uname);
       			            	         
    			            	         UserService.updateUser(user);
    			            	
    			            	 
    			                        }
    			             
    			             
    			             }//end of user Switch
    			             
    			             
    			             
    			   
    		            }
    		   
    		   case 2 : { //PRODUCT
    			   
    			            int myop ;
    			            System.out.println("1.Add Product /n2.get Product /n3.remove Product");
    			            myop = s.nextInt();
    			            
    			            switch(myop) {
    			                                
    			            	case 1 : {   
    			            		            Scanner s2 = new Scanner(System.in);
    			            		            String pname ;
    			            		            Double price ,availqty;
    			            		            System.out.println("Enter Product Name ");
    			            		            pname = s2.nextLine();
    			            		            System.out.println("Enter Price");
    			            		            price = s2.nextDouble();
    			            		            System.out.println("Enter available qty");
    			            		            availqty = s2.nextDouble();
    			            		 
    			            		          Product p =  new Product(pname, price, availqty);
    			            		          ProductService.addProduct(p);
    			            		          
    			            		          System.out.println("prod added successfully .. "+pname);
    			            		          break;
     			            	         }
    			            	
    			            	
    			            	case 2 : { 
    			            		       String pid ;
    			            		       System.out.println("Enter Product Id ");
    			            		       pid = br.readLine();
    			            		       Product p =ProductService.getProduct(Integer.parseInt(pid));
    			            		        System.out.println(p);
    			            	          }
    			                         
    			            
    			            }
    			   
	                    }//end of product switch
    		   
    		   
    		   case 3 : { //Customer
    			   
    			            System.out.println("1.add Cust 2.cusInfo ");
    			            int myop;
    			            myop =Integer.parseInt(br.readLine());
    			            switch (myop) {
    			                           case 1 : {  
    			                        	              System.out.println("Enter Cust Name");
    			                        	              String custName = br.readLine();
    			                        	              System.out.println("Enter cust addrs");
    			                        	              String city =  br.readLine();
    			                        	              System.out.println("Enter cust mobileNo");
    			                        	              String mobileNo = br.readLine();
    			                        	              System.out.println("Enter cust balance");
    			                        	              Double balance = Double.parseDouble(br.readLine());
    			                        	            		  
    			                        	              Customer cust =  new Customer(custName, city, mobileNo, balance);
    			                        	              CustomerService.addCustomer(cust);            	   
    			                                     }
    			            
    			                                  
    			                           case 2 : {   System.out.println();
    			                        	   
    			                                     }
    			                           
    			                           
    			                          }
    			            
    			   
	                    }//end of cust switch
    		   
    		   
    		   case 4 : { //Bill
    			          int myop;
    			           System.out.println("1.Make Bill ");
    			           myop = s.nextInt();
    			            switch (myop) {
    			            
    			            case 1 : {  
    			            	           int pid;
    			            	           
    			            	           double amt=0.0 ;
    			            	           double qty=0.0;
    			            	           boolean prodselect = false;
    			            	           List <Product> prodlist = new ArrayList<Product>();
    			            	           List<Double> qtylist=new ArrayList<Double>();
    			            	           do{
    			            	        	     System.out.println("Select Product");
    	    			            	         List<Product> prlist = ProductService.getAllProducts();
    	    			            	         int var = 1;
    	    			            	         for (Product p :prlist){    			            	        	 
    	    			            	        	 System.out.println(var+"."+p.getProductName()+"  "+p.getProductPrice()+"\n");    			            	        	 
    	    			            	        	 var++;
    	    			            	         }
    	    			            	         
    	    			            	         pid = s.nextInt();
    	    			            	       boolean  qtyflag=false;
    	    			            	         do{
    	    			            	         
    	    			            	         System.out.println("Enter product qty");
    	    			            	         qty = s.nextDouble();
    	    			            	         
    	    			            	         
    	    			            	         Product  prod = prlist.get(pid-1);
    	    			            	         if (prod.getAvailableQuantity() > qty ){ 
    	    			            	        	 prodlist.add(prod);
    	    			            	        	 amt = amt+ prod.getProductPrice() * qty ; 
    	    			            	        	 qtylist.add(qty);
    	    			            	        	 prod.setAvailableQuantity(prod.getAvailableQuantity()-qty);
    	    	    			            	     ProductService.addProduct(prod);
    	    	    			            	     qtyflag=false;
    	    			            	         }
    	    			            	         else{  
    	    			            	        	   System.out.println("sorry plz enter less quantity");
    	    			            	        	   qtyflag=true;
    	    			            	             }
    	    			            	         }
    	    			            	         while(qtyflag);  
                                               System.out.println("to add more prods press y");
    	    			            	         String opt=br.readLine();
    	    			            	         if(opt.equalsIgnoreCase("y")){
    	    			            	        	 prodselect=true;
    			            	           }else{
    			            	        	   prodselect=false;
    			            	           }
    			            	           }
    			            	          while(prodselect);
    			            	           
    			            	           
    			            	       /*  System.out.println("Select Product");
    			            	         List<Product> prlist = ProductService.getAllProducts();
    			            	         int var = 1;
    			            	         for (Product p :prlist){    			            	        	 
    			            	        	 System.out.println(var+"."+p.getProductName()+"  "+p.getProductPrice()+"\n");    			            	        	 
    			            	        	 var++;
    			            	         }
    			            	         
    			            	         pid = s.nextInt();
    			            	         System.out.println("Enter product qty");
    			            	         qty = s.nextDouble();
    			            	         
    			            	         Product  prod = prlist.get(pid-1);
    			            	         if (prod.getAvailableQuantity() > qty ){  			            	        	    
    			            	               amt = prod.getProductPrice() * qty ; */
    			            	               
    			            	               List<Customer> clist = CustomerService.getAllCustomers();
    			            	               System.out.println("Select Customer");
    			            	               int i = 1;
    			            	               for (Customer c : clist){
    			            	            	   System.out.println(i+"."+c.getCustName()+"\n");
    			            	            	   i++;
    			            	            	   
    			            	               }
    			            	               int a = Integer.parseInt(br.readLine())-1;
    			            	               Customer cust =clist.get(a);
    			            	               
    			            	               HashMap<Product, Double> hm = new HashMap<Product, Double>();
    			            	               
    			            	               for(int my=0;i<prodlist.size();i++){
    			            	               hm.put(prodlist.get(my), qtylist.get(my));
    			            	               }
    			            	               
    			            	               Bill bill = new Bill();
    			            	               Transaction tr = new Transaction(bill, prodlist, qtylist, hm);
    			            	               bill.setAmmount(amt);
    			            	               bill.setCustommer(cust);
    			            	               bill.setPoc(SessionFactoryUtil.user);
    			            	               bill.setTransaction(tr);
    			            	               bill.setDate(new Date( new java.util.Date().getDate()));
    			            	               BillService.saveBill(bill);
    			            	               
    			            	               
    			            	        	   //Date date = new Date( new java.util.Date().getDate() );
    	    			            	      /* Bill b = new Bill(date, cust, prodlist, qtylist, amt, SessionFactoryUtil.user);
    	    			            	       BillService.saveBill(b);*/
    	    			            	       
    	    			            	       System.out.println("bill saved successfully " +bill.getBill_Id());
    	    			            	       cust.setBalance(cust.getBalance()+amt);
    	    			            	       CustomerService.addCustomer(cust);
    	    			            	       System.out.println(bill);
    	    			            	      
    			            	         }
    			            	         
    			            }
    			            
	                    }//end of bill switch
    		   
    		   }//inner switch
    		    
    	   }//if ends (passwrd wrong)   
    	   else{
    		   System.out.println("password invalid");
    		   
    	   }

         }

    } //outer switch
}//main
}//class ends