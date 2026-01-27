import pandas as pd
data ={
    "X":[1,2,3,4,5],
    "Y":[3,4,5,6,7],
    "Z":[5,6,7,8,9]
}

df=pd.DataFrame(data)
print(df)
df = pd.read_csv(r"C:\Users\BanalaSharvani\Desktop\Training\qe-python\ex.csv")
print(df)

df.to_csv(
    r"C:\Users\BanalaSharvani\Desktop\Training\qe-python\ex.csv",
    index=False
)
