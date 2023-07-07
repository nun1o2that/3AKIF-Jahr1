class Task:
    def __init__(self, taskId, completionTime):
        self.taskId = taskId
        self.completionTime = completionTime
        self.startId = 0

class TaskPrice:
    def __init__(self, priceSum, startId):
        self.priceSum = priceSum
        self.startId = startId

def printInput():
    print()
    print(N)
    for price in priceList:
        print(price)
    print(M)
    for task in taskList:
        print(str(task.taskId) + " " + str(task.completionTime))

def printOutput():
    print()
    print(M)
    for task in taskList:
        print(str(task.taskId) + " " + str(task.startId)) 

def determineStart():
    for task in taskList:
        taskPrices = []
        priceAtThisStart = 0
        if task.completionTime == 1:
            possibilities = len(priceList) - task.completionTime
        else:
            possibilities = len(priceList) - task.completionTime + 1
        
        for p in range(possibilities):
            start = p
            priceAtThisStart = 0
            for c in range(task.completionTime):
                priceAtThisStart += priceList[start]
                start += 1
            taskPrices.append(TaskPrice(priceAtThisStart, p))
            
        priceResults = []
        for tP in taskPrices:
            priceResults.append(tP.priceSum)

        cheapestPrice = priceResults[0]
        for pR in priceResults:
            if pR < cheapestPrice:
                cheapestPrice = pR
        
        for tP in taskPrices:
            if cheapestPrice == tP.priceSum:
                task.startId = tP.startId
                break

# Daten aus der PDF entnommen
N = 10;
priceList = [8335, 8464, 9513, 9006, 8675, 5805, 2747, 2691, 5677, 7079]
# 46901
# 52578
# 51193

M = 5
taskList = [Task(1, 5), Task(2, 1), Task(3, 6), Task(4, 9), Task(5, 7)]

printInput()
determineStart()
printOutput()