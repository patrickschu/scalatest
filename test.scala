class MList[+T] {
def ?:[B >: T](x: B): MList[B] = new ?:(x, this)}
