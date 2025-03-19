class DatabaseConnection{

private static DatabaseConnection database;
static DatabaseConnection instanceOf()
{
if(database==null)

{
database=new DatabaseConnection();
return database;
}
return database;
}
void query(){
System.out.println("Query in progress");
}

}
