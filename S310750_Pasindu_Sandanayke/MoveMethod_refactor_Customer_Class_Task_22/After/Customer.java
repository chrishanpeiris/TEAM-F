public string MailingAddress()
{
    print(AddressBuilder(currentAddress.City,currentAddress.State,currentAddress.PostaCode);
}

public String AddressBuilder(City,State,PostaCode)
{
	StringBuilder sb = new StringBuilder ();
    sb.Append(AddressLine1);
    sb.Append("\n");
    sb.Append(City + ", " + State);
    sb.Append("\n");
    sb.Append(PostalCode);
    return sb.ToString();
}