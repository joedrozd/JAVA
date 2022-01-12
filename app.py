from budget import Account

Joe = Account()
Joe._init_()
print("Deposit a starter amount!")
Joe.deposit()
def query():
    options = ["withdraw", "deposit","enquiry"]
    print(options)
    query1 = input("What would you like to do?")
    if (query1 == "withdraw"):
        Joe.withdraw()
        yn = input("Thanks, do you want to do anything else? Yes/No?")
        if(yn == "yes"):
            query()
        else:
            return
    elif (query1 == "deposit"):
        Joe.deposit()
        yn = input("Thanks, do you want to do anything else? Yes/No?")
        if(yn == "yes"):
            query()
        else:
            return
    elif (query1 == "enquiry"):
        Joe.enquiry()
        yn = input("Thanks, do you want to do anything else? Yes/No?")
        if(yn == "yes"):
            query()
        else:
            return
    else:
        print("Query not understood, please try again!")
        query()
query()

Joe.enquiry()