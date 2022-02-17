import random

class GameObject:
    distance = 0
    x = 0
    y = 0

    def __init__(self,x,y,distance):
        self.x = x
        self.y = y
        self.distance = distance

    def getX():
        return x
    def getY():
        return y
    def collide(self,p):
        if self.x == p.getX and self.y == p.getY:
            return true
        return false

class Bear(GameObject):
    def __init__(self,x,y,distance):
        super().__init__(x,y,distance)

    def getShape():
        return 'B'
    
class Fish(GameObject):
    def __init__(self,x,y,distance):
        super().__init__(x,y,distance)
        
    def getShape():
        return '@'

class Game:
    move = ""
    x = 0
    y = 0
    distance = 0
    
