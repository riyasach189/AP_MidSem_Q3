package org.example;

public class Pincode {
    private final String pincode;

    public Pincode(String pincode) throws IncorrectPincodeException {
        if (pincode.length() != 6)
        {
            if (pincode.startsWith("0"))
            {
                throw new IncorrectPincodeException("The length of the pincode must be 6 digits.\nThe pincode cannot begin with 0");
            }

            else {
                throw new IncorrectPincodeException("The length of the pincode must be 6 digits.");
            }
        }

        else if (pincode.startsWith("0"))
        {
            throw new IncorrectPincodeException("The pincode cannot begin with 0");
        }

        else
        {
            this.pincode = pincode;
        }
    }

    public String getPincode() {
        return pincode;
    }
}
