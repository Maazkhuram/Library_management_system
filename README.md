This project implements a Digital Library System that manages books, borrowers, and the borrowing process within a library.

The system allows for the management of physical and electronic books (eBooks), including features for adding books, registering borrowers, lending and returning books, and displaying borrowed items. The system is structured with the following core components:

Book Management: Books are stored with essential details such as title, author, ISBN, and year. For eBooks, additional attributes like format, file size, and URL are managed.

Borrower Management: The system tracks borrower details, ensuring that each borrower is unique through the use of borrower IDs. Borrowers can borrow and return books, with the system handling the availability of each item.

Book Lending: The system prevents the borrowing of unavailable books and ensures that only registered borrowers can borrow books. It allows for smooth book lending and returning processes with appropriate messages for errors or successes.
