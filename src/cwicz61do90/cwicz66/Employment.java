package cwicz61do90.cwicz66;

enum Employment {
    FULL_TIME, PART_TIME, CONTRACT;

    boolean checkEmployeeEmployment(Employee employee){
        return this == employee.getEmployment();
    }
}
