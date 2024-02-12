package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 employees to the staffList (Task Done)

        staffList[0] = new Executive("John Smith", "123 Main St", "555-1234", "123-45-6789", 100000.0);
        staffList[1] = new StaffEmployee("Angelina Jolie", "987 Cedar St", "555-0987", "516-333476", 89.00);
        staffList[2] = new StaffEmployee("Pharell Williams", "789 Elm St", "555-7890","329-964785",89.0);
        staffList[3] = new TempEmploee("Aubrey Graham", "321 Pine St", "555-4321","992-759032", 40.0);
        staffList[4] = new Intern("Salma Hayek", "654 Birch St", "555-8765");
        staffList[5] = new Intern("George Washington", "456 Oak St", "555-5678");

        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
