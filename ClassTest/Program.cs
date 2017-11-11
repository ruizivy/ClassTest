using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassTest
{
    class MyClass
    {
      public static void Main(string[] args)
        {
            //NewClass testClass = new NewClass("This is called in NewClass");
            //Console.WriteLine(testClass.PrintMessage())

            string fName = GetResponse("Enter Firtname : ");
            string lName = GetResponse("Enter Lastname: ");
            string address = GetResponse("Enter Address : ");

            StudentName names = new StudentName(fName,lName,address);
            Console.WriteLine(names.PrintFirst() + " " + names.PrintLast() + " " + names.PrintAddr());
           
         

        }
      private static string GetResponse(string prompt)
      {
          Console.Write(prompt);
          return Console.ReadLine();
      }
    }
      class NewClass
      {
          private string MyMessage;

          public NewClass(string message)
          {
              this.MyMessage = message;
          }
          public string PrintMessage()
          {
              return this.MyMessage;
          }
      }
      class StudentName
      {
          private string Fname;
          private string LName;
          private string Address;

          public StudentName(string first, string last, string addr)
          {
              this.Fname = first;
              this.LName = last;
              this.Address = addr;
          }
          public string PrintFirst()
          {
              return this.Fname;
          }
          public string PrintLast()
          {
              return this.LName;
          }
          public string PrintAddr()
          {
              return this.Address;
          }
      }
    }
