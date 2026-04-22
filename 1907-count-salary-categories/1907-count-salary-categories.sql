select "Low Salary" as category,
   count(income) as accounts_count
   from accounts
   where income < 20000

   UNION ALL

select "Average Salary" as category,
   count(income) as accounts_count
   from accounts
   where income >= 20000 and income <=50000

 UNION ALL

   select "High Salary" as category,
   count(income) as accounts_count
   from accounts
   where income >50000

