public SqlDataReader SqlData()
{
    SqlConnection con = new SqlConnection(ConnectionString);
    SqlCommand cmd = con.CreateCommand();
    con.Open();
    cmd.CommandType = CommandType.StoredProcedure;
    cmd.CommandText = "spSampleStoredProc";
    return cmd.ExecuteReader(CommandBehavior.CloseConnection);
}