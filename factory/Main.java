class Main
{

public static void main(String args[]){

Notification not=NotificationFactory.getObject("push");
not.send();
}
}