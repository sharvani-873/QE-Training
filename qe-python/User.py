class Car:
    def __init__(self,manufacturer,model,transmission,colour):
        self.manufacturer=manufacturer
        self.model=model
        self.transmission=transmission
        self.colour=colour
    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")
    def stop(self):
        print(f"{self.manufacturer} {self.model} is stopped")

c1=Car("Honda" , 123,"asdgh","red")
c2=Car("BMW" , 123,"zxcvbh","blue")
c3=Car("Suzuki" , 123,"wsdgh","green")
c1.accelerate()