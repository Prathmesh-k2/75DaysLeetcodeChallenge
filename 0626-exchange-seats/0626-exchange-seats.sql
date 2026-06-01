select 
    case 
        when id=(select max(id) from seat) and mod(id ,2)=1
        then id
        when
            mod(id ,2)=1
            then id+1
        else 
             id-1
    End as id , student
From Seat
order by id;

    
