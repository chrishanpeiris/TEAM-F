private SqlCommand PrepareCommand(string storedProcedureName)
{
    SqlConnection con = new SqlConnection(ConnectionString);
    SqlCommand cmd = con.CreateCommand();
    con.Open();
    cmd.CommandType = CommandType.StoredProcedure;
    cmd.CommandText = storedProcedureName;
    return cmd;
}
 
public SqlDataReader GetData()
{
    SqlCommand cmd = PrepareCommand("spSampleStoredProc");
    return cmd.ExecuteReader(CommandBehavior.CloseConnection);
}