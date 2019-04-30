//In my opinion, keeping the code clear is the most critical: 
//If the "single exit" makes the function clearer and easier to read, 
//then use a single exit; otherwise you don't have to.
//We do not need that much if-else statement, it makes code hard to read,
//So, it is refactoring to below
 
 double getPayAmount() {

   if (_isDead) return deadAmount();
   if (_isSeparated) return separatedAmount();
   if (_isRetired) return retiredAmount();
  return normalPayAmount();
 };
