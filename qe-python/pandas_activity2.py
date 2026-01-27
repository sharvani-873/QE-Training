import pandas as pd
data = {
    "FirstName": ["Satvik", "Avinash", "Lahri"],
    "LastName": ["Shah", "Kati", "Rath"],
    "Email": [
        "satshah@example.com",
        "avinashk@example.com",
        "lahri.rath@example.com"
    ],
    "PhoneNumber": [4537829158, 5892184058, 4528727830]
}

df = pd.DataFrame(data)
df.to_excel(
    r"C:\Users\BanalaSharvani\Desktop\Training\qe-python\users.xlsx",
    sheet_name="Sheet1", index=False
)
print(df)
print(df.shape)
print(df["FirstName"])
print(df.sort_values(by="FirstName", ascending=False))
