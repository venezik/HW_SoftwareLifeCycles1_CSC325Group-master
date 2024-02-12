package com.mycompany.agency;



    // TODO 1: Make Intern a child of StaffEmployee (Task Done)

public class Intern extends StaffEmployee
{
    //-----------------------------------------------------------------
    //  TODO 2: Constructor: Sets up this intern using the specified  (Task Done)
    //  information.
    //-----------------------------------------------------------------
    public Intern(String eName, String eAddress, String ePhone,
                  String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
    }

    //-----------------------------------------------------------------
    // TODO 3:  Returns a zero pay value for this intern. (Task Done)
    //-----------------------------------------------------------------
    public double pay()
    {
        return 0.0;
    }
}
