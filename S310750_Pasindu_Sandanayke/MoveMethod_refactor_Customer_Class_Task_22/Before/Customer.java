Class Customer{
private Address currentAddress = null;
public string MailingAddress()
{
    StringBuilder sb = new StringBuilder ();
    sb.Append(currentAddress.AddressLine1);
    sb.Append("\n");
    sb.Append(currentAddress.City + ", " + currentAddress.State);
    sb.Append("\n");
    sb.Append(currentAddress.PostalCode);
    return sb.ToString();
}

}