public class Main {
  
  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    Container c = new Container();
    Class<?> cls = c.getClass();

  if ( ! cls.isAnnotationPresent(SaveTo.class)) {
    System.out.println("Error!");
    return;
  }

    SaveTo saveTo = cls.getAnnotation(SaveTo.class);
    String path = saveTopath();
    Method[] methods = cls.getDeclaredMethods();

    for (Method m : methods) {
      if (m.isAnnotationPresent(Saver.class)) {
        m.invoke(c, path);
        break;
      }
    }
    System.our.println("Done!");
  }
}

      
                  
