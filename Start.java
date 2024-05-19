import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;


public class Start {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        FoodCourt fc = new FoodCourt();
        FileReadWrite frwd = new FileReadWrite();

        System.out.println("-----------------------------------");
        System.out.println("Welcome to FS FoodCourt");
        System.out.println("-----------------------------------\n");

        boolean repeat = true;

        while (repeat) {
            System.out.println("What do you want to do?");
            System.out.println("\t1. Employee Management");
            System.out.println("\t2. Restaurant Management");
            System.out.println("\t3. Restaurant Food Item Management");
            System.out.println("\t4. FoodItem Quantity Add-Sell");
            System.out.println("\t5. Exit");
            System.out.println("-----------------------------------\n");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------------");

            switch (choice) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("You Choose Employee Management");
                    System.out.println("---------------------------------");

                    System.out.println("You have following options: \n");
                    System.out.println("\t1. Insert New Employee");
                    System.out.println("\t2. Remove Existing Employee");
                    System.out.println("\t3. Show All Employees");
                    System.out.println("\t4. Search an Employee");
                    System.out.println("\t5. Go Back");

                    System.out.print("Enter You Option: ");
                    int option1 = sc.nextInt();
                    sc.nextLine();

                    switch (option1) {
                        case 1:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Insert An Employee");
                            System.out.println("---------------------------------");

                            System.out.print("Enter Employee ID: ");
                            String empId1 = sc.next();
                            System.out.print("Enter Employee Name: ");
                            String name1 = sc.next();
                            System.out.print("Enter Employe Salary: ");
                            double salary1 = sc.nextDouble();
                            sc.nextLine();

                            Employee e1 = new Employee();
                            e1.setEmpId(empId1);
                            e1.setName(name1);
                            e1.setSalary(salary1);

                            if (fc.insertEmployee(e1)) {
                                System.out.println("Employee Inserted with ID: " + e1.getEmpId());
                            } else {
                                System.out.println("Employee Can Not be Insertd......");
                            }

                            break;

                        case 2:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Remove An Employee");
                            System.out.println("---------------------------------");

                            System.out.print("Enter an Employee ID to Remove: ");
                            String empId2 = sc.next();

                            Employee e2 = fc.searchEmployee(empId2);

                            if (e2 != null) {
                                if (fc.removeEmployee(e2)) {
                                    System.out.println("Employee Removed with ID: " + e2.getEmpId());
                                } else {
                                    System.out.println("Employee Can Not be Removed......");
                                }
                            } else {
                                System.out.println("Employee Does Not Exist");
                            }
                            break;

                        case 4:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Search An Employee");
                            System.out.println("---------------------------------");

                            System.out.print("Enter an Employee ID to Search: ");
                            String empId3 = sc.next();

                            Employee e3 = fc.searchEmployee(empId3);

                            if (e3 != null) {
                                System.out.println("Employee Found");
                                System.out.println("Employee ID: " + e3.getEmpId());
                                System.out.println("Employee Name: " + e3.getName());
                                System.out.println("Employee Salary: " + e3.getSalary());
                            } else {
                                System.out.println("Employee Does Not Exist");
                            }

                            break;

                        case 3:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to See All Employees");
                            System.out.println("---------------------------------");

                            fc.showAllEmployees();

                            break;

                        case 5:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Go Back.......");
                            System.out.println("---------------------------------");

                            break;

                        default:
                            System.out.println("-----------------------------------");
                            System.out.println("Invalid Choice.....");
                            break;

                    }

                    break;
                case 2:
                    System.out.println("---------------------------------");
                    System.out.println("You Choose Restaurant  Management");
                    System.out.println("---------------------------------");

                    System.out.println("You have following options: \n");
                    System.out.println("\t1. Insert New Restaurant");
                    System.out.println("\t2. Remove Existing Restaurant");
                    System.out.println("\t3. Show All Restaurant");
                    System.out.println("\t4. Search A Restaurant");
                    System.out.println("\t5. Go Back");

                    System.out.print("Enter You Option: ");
                    int option2 = sc.nextInt();
                    sc.nextLine();

                    switch (option2) {
                        case 1:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Insert A New Restaurant");
                            System.out.println("---------------------------------");

                            System.out.print("Enter Restaurant Name: ");
                            String name1 = sc.next();
                            System.out.print("Enter Restaurant RID: ");
                            String rid1 = sc.next();

                            Restaurant r1 = new Restaurant();
                            r1.setRid(rid1);
                            r1.setName(name1);

                            if (fc.insertRestaurant(r1)) {
                                System.out.println("Restaurant Inserted with ID: " + r1.getRid());
                            } else {
                                System.out.println("Restaurant Can Not be Inserted......");
                            }

                            break;

                        case 2:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Remove Existing Restaurant");
                            System.out.println("---------------------------------");
                            System.out.print("Enter a Restaurant RID to Remove: ");
                            String rid2 = sc.next();

                            Restaurant r2 = fc.searchRestaurant(rid2);

                            if (r2 != null) {
                                if (fc.removeRestaurant(r2)) {
                                    System.out.println("Restaurant Removed with ID: " + r2.getRid());
                                } else {
                                    System.out.println("Restaurant Can Not be Removed......");
                                }
                            } else {
                                System.out.println("Restaurant Does Not Exist");
                            }
                            break;
                        case 3:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to See All Restaurant");
                            System.out.println("---------------------------------");

                            fc.showAllRestaurants();

                            break;
                        case 4:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Search A Restaurant");
                            System.out.println("---------------------------------");

                            System.out.print("Enter an Restaurant RID to Search: ");
                            String rid3 = sc.next();

                            Restaurant r3 = fc.searchRestaurant(rid3);

                            if (r3 != null) {
                                System.out.println("Restaurant Found");
                                System.out.println("Restaurant RID: " + r3.getRid());
                                System.out.println("Restaurant Name: " + r3.getName());

                            } else {
                                System.out.println("Restaurant Does Not Exist");
                            }

                            break;
                        case 5:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Go Back.......");
                            System.out.println("---------------------------------");

                            break;

                        default:
                            System.out.println("-----------------------------------");
                            System.out.println("Invalid Choice.....");
                            break;
                    }

                    break;
                case 3:
                    System.out.println("---------------------------------");
                    System.out.println("You Choose Restaurant FoodItem Management");
                    System.out.println("---------------------------------");

                    System.out.println("You have following options: \n");
                    System.out.println("\t1. Insert New FoodItem");
                    System.out.println("\t2. Remove Existing FooItem");
                    System.out.println("\t3. Show All FoodItems");
                    System.out.println("\t4. Search a FoodItem");
                    System.out.println("\t5. Go Back");

                    System.out.print("Enter You Option: ");
                    int option3 = sc.nextInt();
                    sc.nextLine();
                    switch (option3) {
                        case 1:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Insert New FoodItem");
                            System.out.println("---------------------------------");
                            System.out.print("Enter Restaurant RID: ");
                            String rid1 = sc.nextLine();
                            Restaurant rest = fc.searchRestaurant(rid1);
                            //System.out.print("Enter Food Item FID: ");
                            //String fid1 = sc.next();

                            if (rest != null) {
                                System.out.println("\tChoose your Food Item Type \n");
                                System.out.println("\t1. Main Dish");
                                System.out.println("\t2. Appitizer");
                                System.out.println("\t3. Go Back....");

                                System.out.print("Enter Food Type: ");
                                int foodItemType = sc.nextInt();
                                sc.nextLine();

                                if (foodItemType == 1) {

                                    System.out.print("Enter Food Item Id: ");
                                    String fid1 = sc.nextLine();
                                    System.out.print("Enter Food Name: ");
                                    String b1 = sc.nextLine();
                                    System.out.print("Enter Quantity: ");
                                    int ir = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Enter Price: ");
                                    double p = sc.nextDouble();
                                    sc.nextLine();
                                    System.out.print("Enter Category");
                                    String c = sc.nextLine();

                                    FoodItem md = new MainDish();

                                    md.setFid(fid1);
                                    md.setName(b1);
                                    md.setAvailableQuantity(ir);
                                    md.setPrice(p);
                                    // md.setCategory(c);
                                    ((MainDish) md).setCategory(c);

                                    if (rest.insertFoodItem(md)) {
                                        System.out.println(md.getFid() + " Inserted for " + fid1);
                                    } else {
                                        System.out.println("Food Item Can Not be inserted.");
                                    }

                                } else if (foodItemType == 2) {

                                    System.out.print("Enter Food Item Id: ");
                                    String an1 = sc.nextLine();
                                    System.out.print("Enter Food Name: ");
                                    String b1 = sc.nextLine();
                                    System.out.print("Enter Quantity: ");
                                    int ir = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Enter Price: ");
                                    double p = sc.nextDouble();
                                    sc.nextLine();
                                    System.out.print("Enter Size: ");
                                    int s = sc.nextInt();
                                    sc.nextLine();

                                    Appitizers a = new Appitizers();

                                    a.setFid(an1);
                                    a.setName(b1);
                                    a.setAvailableQuantity(ir);
                                    a.setPrice(p);
                                    a.setSize(s);
                                    ((Appitizers) a).setSize(s);

                                    if (rest.insertFoodItem(a)) {
                                        System.out.println(a.getFid() + " Inserted for " + an1);
                                    } else {
                                        System.out.println("Food Item Can Not be inserted.");
                                    }
                                } else if (foodItemType == 3) {
                                    System.out.println("Going Back.......");
                                } else {
                                    System.out.println("Invalid Input.......");
                                }
                            } else {
                                System.out.println("FID MISMATCH");
                                /*
                                System.out.print("Enter Food Name: ");
                                String b1 = sc.nextLine();
                                System.out.print("Enter Quantity: ");
                                int ir = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter Price: ");
                                double p = sc.nextDouble();
                                sc.nextLine();
                                System.out.print("Enter Category : ");
                                String c = sc.nextLine();

                                FoodItem md = new MainDish();

                                md.setFid(fid1);
                                md.setName(b1);
                                md.setAvailableQuantity(ir);
                                md.setPrice(p);
                                ((MainDish) md).setCategory(c);
                                rest.insertFoodItem(md);
                                */

                            }

                            break;

                        case 2:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Remove Existing FoodItem");
                            System.out.println("---------------------------------");
                            System.out.print("Enter Restaurant RID: ");
                            String rid2 = sc.nextLine();
                            Restaurant rest2 = fc.searchRestaurant(rid2);
                            System.out.print("Enter a Food Id FID to Remove: ");
                            String fid2 = sc.nextLine();

                            FoodItem f2 = rest2.searchFoodItem(fid2);

                            if (f2 != null) {
                                if (rest2.removeFoodItem(f2)) {
                                    System.out.println("Food Item Removed with ID: " + f2.getFid());
                                } else {
                                    System.out.println("Food Item Can Not be Removed......");
                                }
                            } else {
                                System.out.println("Food Item Does Not Exist");
                            }
                            break;

                        case 3:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to See All Food Item");
                            System.out.println("---------------------------------");
                            System.out.print("Enter Restaurant RID: ");
                            String rid3 = sc.nextLine();
                            Restaurant rest3 = fc.searchRestaurant(rid3);
                            rest3.showAllFoodItems();

                            break;

                        case 4:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Search A Food Item");
                            System.out.println("---------------------------------");
                            System.out.print("Enter Restaurant RID: ");
                            String rid4 = sc.nextLine();
                            Restaurant rest4 = fc.searchRestaurant(rid4);
                            System.out.print("Enter an Food Id FID to Search: ");
                            String fid3 = sc.nextLine();

                            FoodItem f3 = rest4.searchFoodItem(fid3);

                            if (f3 != null) {
                                System.out.println("Food Item Found");
                                System.out.println("Food Id FID: " + f3.getFid());
                                System.out.println("Food Name: " + f3.getName());

                            } else {
                                System.out.println("Food Item Does Not Exist");
                            }

                            break;
                        case 5:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Go Back.......");
                            System.out.println("---------------------------------");

                            break;

                        default:
                            System.out.println("-----------------------------------");
                            System.out.println("Invalid Choice.....");
                            break;
                    }

                    break;
                case 4:
                    System.out.println("---------------------------------");
                    System.out.println("You Choose FoodItem Quantity Add-Sell");
                    System.out.println("---------------------------------");

                    System.out.println("You have following options: \n");
                    System.out.println("\t1. Add FoodItem");
                    System.out.println("\t2. Sell FoodItem");
                    System.out.println("\t3. Show Add Sell History");
                    System.out.println("\t4. Go Back");

                    System.out.print("Enter You Option: ");
                    int option4 = sc.nextInt();
                    sc.nextLine();

                    switch (option4) {
                        case 1:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Add Food Item");
                            System.out.println("---------------------------------");

                            System.out.print("Enter Restaurant RID: ");
                            String rid1 = sc.nextLine();
                            if (fc.searchRestaurant(rid1) != null) {
                                System.out.print("Enter Food Item FId: ");
                                String an1 = sc.nextLine();

                                if (fc.searchRestaurant(rid1).searchFoodItem(an1) != null) {
                                    System.out.print("Enter Amount to Add Quantity: ");
                                    int am = sc.nextInt();
                                    sc.nextLine();

                                    if (fc.searchRestaurant(rid1).searchFoodItem(an1).addQuantity(am)) {
                                        System.out.println("Add Done.");
                                        frwd.writeInFile(
                                                "Add: " + am + " in Food Item Number: " + an1 + " by RID: " + rid1);

                                    } else {
                                        System.out.println("add Not Done.");
                                    }
                                } else {
                                    System.out.print("Invalid Food Item Number");
                                }
                            } else {
                                System.out.print("RID MISMATCH");
                            }

                            break;

                        case 2:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to Sell Food Item");
                            System.out.println("---------------------------------");

                            System.out.print("Enter Restaurant RID: ");
                            String rid6 = sc.nextLine();

                            if (fc.searchRestaurant(rid6) != null) {
                                System.out.print("Enter Food Item FId: ");
                                String an1 = sc.nextLine();

                                if (fc.searchRestaurant(rid6).searchFoodItem(an1) != null) {
                                    System.out.print("Enter Amount to Sell Quantity: ");
                                    int am = sc.nextInt();
                                    sc.nextLine();

                                    if (fc.searchRestaurant(rid6).searchFoodItem(an1).sellQuantity(am)) {
                                        System.out.println("Sell Done.");
                                        frwd.writeInFile(
                                                "sell: " + am + " in Food Item Number: " + an1 + " by RID: " + rid6);

                                    } else {
                                        System.out.println("Sell Not Done.");
                                    }
                                } else {
                                    System.out.print("Invalid Food Item Number");
                                }
                            } else {
                                System.out.print("RID MISMATCH");
                            }

                            break;
                        case 3:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose to See Add-Sell History");
                            System.out.println("---------------------------------");
                            frwd.readFromFile();
                            break;
                        case 4:
                            System.out.println("---------------------------------");
                            System.out.println("You Choose Exit");
                            System.out.println("---------------------------------");
                            repeat = false;
                            break;

                        default:
                            System.out.println("-----------------------------------");
                            System.out.println("Invalid Choice.....");
                            break;
                    }
            }
            System.out.println("-----------------------------------\n");
        }
    }
}