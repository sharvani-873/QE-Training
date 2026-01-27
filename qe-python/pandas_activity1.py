import pandas as pd
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}
df = pd.DataFrame(data)
df.to_csv(
    r"C:\Users\BanalaSharvani\Desktop\Training\qe-python\users.csv",
    index=False
)

print("CSV file created successfully")
print(df["Usernames"])
print(df.loc[1])
print(df.sort_values("Usernames"))
print(df.sort_values("Passwords", ascending=False))