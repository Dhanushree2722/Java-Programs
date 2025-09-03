package transport;
//class which cannot be inherited
public final class SecurityRules
{
	//no objects are allowed to create
    private SecurityRules() {
        
    }
//checking if flying is allowed
    public static boolean canFly(String place)
    {
        if (place.equalsIgnoreCase("ExamCell")) 
        {
            return false;
        }
        return true;
    }
}

