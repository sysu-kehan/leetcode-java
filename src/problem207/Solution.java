package problem207;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    List<Course> courseList = new ArrayList<>();
    for (int i = 0; i < numCourses; i++) {
      courseList.add(new Course(i));
    }
    for (int i = 0; i < prerequisites.length; i++) {
      int courseNum = prerequisites[i][0];
      int beforeCourseNum = prerequisites[i][1];
      int index = courseList.indexOf(new Course(courseNum));
      Course course = courseList.get(index);
      if (course.beforeCourse.indexOf(beforeCourseNum) < 0) {
        course.beforeCourse.add(beforeCourseNum);
      }
    }
    List<Course> finishCourseList = new ArrayList<>();
    Iterator<Course> iterator;
    while (!courseList.isEmpty()) {
      iterator = courseList.iterator();
      while (iterator.hasNext()) {
        Course course = iterator.next();
        if (course.beforeCourse.isEmpty()) {
          finishCourseList.add(course);
          iterator.remove();
        }
      }
      if (finishCourseList.isEmpty()) {
        return false;
      }
      iterator = courseList.iterator();
      while (iterator.hasNext()) {
        Course course = iterator.next();
        for (int i = 0; i < finishCourseList.size(); i++) {
          Course finishCourse = finishCourseList.get(i);
          course.beforeCourse.remove(new Integer(finishCourse.val));
        }
      }
      finishCourseList.clear();
    }
    return true;
  }

  private class Course {
    int val;
    List<Integer> beforeCourse;
    Course(int val) {
      this.val = val;
      beforeCourse = new LinkedList<>();
    }

    @Override
    public boolean equals(Object obj) {
      if (obj instanceof Course) {
        return val == ((Course) obj).val;
      }
      return false;
    }
  }
}
