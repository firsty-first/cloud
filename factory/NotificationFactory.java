class NotificationFactory{

public static Notification getObject(String s){

switch(s){
case "email":
{
return new EmailNotification();

}
case "push":
{
return new PushNotification();

}
case "sms":
{
return new SmsNotification();
}

default:
throw new IllegalArgumentException("unknown object requested ");

}
}

}