package com.awang.finaltest;

        /**
         * 定义一个 JavaBean 类描述圆
         * 属性：半径和圆周率
         * 行为：计算圆的面积和周长
         */
        public class circle {
            // 属性：半径
            private double radius;
            // 属性：圆周率 (通常作为常量，这里为了演示JavaBean也作为属性)
            final private double pi = 3.14;

            // 无参构造方法
            public circle() {
            }

            // 有参构造方法，方便创建对象时直接赋值
            public circle(double radius) {
                this.radius = radius;
            }

            // Getter 和 Setter 方法
            public double getRadius() {
                return radius;
            }

            public void setRadius(double radius) {
                this.radius = radius;
            }
            // final修饰，只有set方法
            public double getPi() {
                return pi;
            }



            // 行为：计算圆的面积 (π * r * r)
            public double getArea() {
                return pi * radius * radius;
            }

            // 行为：计算圆的周长 (2 * π * r)
            public double getLength() {
                return 2 * pi * radius;
            }
        }


