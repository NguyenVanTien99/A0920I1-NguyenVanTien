package controllers._4_employee_menu;

import controllers.file.ReadFile;

public class ShowEmployee {
    public static void showInforEmployee() {
        ReadFile.readfileEmployee();
        int index  = 1;
        for(String key : ReadFile.employeeList.keySet()){
            System.out.println(index++ + ": " + key + " " + ReadFile.employeeList.get(key).showInfor());
        }
    }
}
