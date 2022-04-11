

  Feature: a user wants to buy clothes in New Experience
    I as user
    want to be able to browse the New Experience page
    to buy their clothes

    @story
    Scenario: user buy
      Given The user wants to enter the main page of New Experience
      When The user adds two items to the shopping cart.
      And the user searches for a product and adds it to the shopping cart
      |seaProduct           |cant|size|
      |Printed Chiffon Dress|  5 |  L |
      And the user modifies the products to be purchased
      And user logs in
      |email        |password|
      |lgg@gmail.com|741852  |
    #  And the user adds a new delivery address
    #  |firstName|lastName|Address      |city        |state       |zip     |country        |Phone            |nameAddress |
    #  |Luigi    | JFK    | Cll 3 #32   | Sacramento | California | 94240  | United States |  424434425      |Home Luigi  |
      And the user accepts the terms and conditions and continues with the process
      Then  Verify order was done correctly
        | title                               |
        | Your order on My Store is complete. |