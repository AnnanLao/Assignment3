package se.chalmers.dm;

import com.github.javafaker.Address;
import com.github.javafaker.Bool;
import com.github.javafaker.Faker;

import java.sql.SQLException;
import java.sql.Statement;
public class Seeder {

    public static void createUserTable() {
        Statement statement = null;
        try {

            statement.executeQuery("CREATE TABLE tbl_user ID INTEGER PRIMARY KEY, INTEGER Ssn, " +
                    "FName VARCHAR, LName VARCHAR, Email VARCHAR, isActive boolean;");


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public static void insertFakeUsers(int n) throws SQLException {
        Faker faker = new Faker();
        int ID = 0;
        Statement statement = null;
        for(int i = 0; i < n; i++){

            String FName = faker.name().firstName();
            String LName = faker.name().lastName();
            String Ssn = faker.idNumber().ssnValid();
            Address Address = faker.address();
            String Email = FName+LName+"@gmail.com";
            Bool isActive = faker.bool();

            statement.executeQuery("INSERT INTO tbl_user VALUES" + "("+ID+", "+Ssn+", "+FName+", "+LName+", "+
                    Email+", "+isActive);

                    ID++;



        }

    }
    public static void createWebPageTable(){
            Statement statement = null;
            try {

                statement.executeQuery("CREATE TABLE tbl_webpage ID INTEGER PRIMARY KEY, URL VARCHAR, " +
                        "AUTHOR VARCHAR FOREIGN KEY, Content VARCHAR, popularity FLOAT;");


            } catch (SQLException e) {
                e.printStackTrace();
            }

    }

    public static void seeder.insertFakeUsersWithWebPage(int n){
        Faker faker = new Faker();
        int id = 0;
        int author;
        Statement statement = null;
        for(int i = 0; i < n; i++){
            
            insertFakeUsers(1);
            String content = faker.chuckNorris();
            double randNumber = Math.random();
            d = randNumber * 100;
            int popularity = (int)d + 1;
            URL myURL = new URL("http://example.com/");
            
            statement.executeQuery("INSERT INTO tbl_webpage VALUES" + "("+id+", "+author+", "+myURL+", "+content+", "+
                    popularity);

            id++;
        }

    }

}


