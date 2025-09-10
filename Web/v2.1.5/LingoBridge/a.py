

def main():
    g1 = Gemini()
    g1.run()
    num = g1.time
    print(num)

class Gemini:
    def __init__(self):
        self.feedback = ""
        self.time = -1

    def run(self):
        self.time = 35
        print("run")

main()