package nl.jqno.equalsverifier.coverage;

import nl.jqno.equalsverifier.testhelpers.types.Color;

// CHECKSTYLE: ignore LocalFinalVariableName for 120 lines.
// CHECKSTYLE: ignore NeedBraces for 120 lines.
public class LombokCanEqual {
    /**
     * equals and hashCode generated by Project Lombok 0.12, using delombok.
     */
    /*
     * Original class:
     *
     * @EqualsAndHashCode
     * public static class Point {
     *     private final int x;
     *     private final int y;
     *
     *     public Point(int x, int y) {
     *         this.x = x;
     *         this.y = y;
     *     }
     * }
     */
    public static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public boolean equals(final java.lang.Object o) {
            if (o == this) return true;
            if (!(o instanceof LombokCanEqual.Point)) return false;
            final Point other = (Point)o;
            if (!other.canEqual((java.lang.Object)this)) return false;
            if (this.x != other.x) return false;
            if (this.y != other.y) return false;
            return true;
        }

        @java.lang.SuppressWarnings("all")
        public boolean canEqual(final java.lang.Object other) {
            return other instanceof LombokCanEqual.Point;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public int hashCode() {
            final int PRIME = 31;
            int result = 1;
            result = result * PRIME + this.x;
            result = result * PRIME + this.y;
            return result;
        }
    }

    /**
     * equals and hashCode generated by Project Lombok 0.12, using delombok.
     */
    /*
     * Original class:
     *
     * @EqualsAndHashCode(callSuper=true)
     * public static class ColorPoint extends Point {
     *     private final Color color;
     *
     *     public ColorPoint(int x, int y, Color color) {
     *         super(x, y);
     *         this.color = color;
     *     }
     * }
     */
    public static class ColorPoint extends Point {
        private final Color color;

        public ColorPoint(int x, int y, Color color) {
            super(x, y);
            this.color = color;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public boolean equals(final java.lang.Object o) {
            if (o == this) return true;
            if (!(o instanceof LombokCanEqual.ColorPoint)) return false;
            final ColorPoint other = (ColorPoint)o;
            if (!other.canEqual((java.lang.Object)this)) return false;
            if (!super.equals(o)) return false;
            final java.lang.Object this$color = this.color;
            final java.lang.Object other$color = other.color;
            if (this$color == null ? other$color != null : !this$color.equals(other$color)) return false;
            return true;
        }

        @java.lang.SuppressWarnings("all")
        public boolean canEqual(final java.lang.Object other) {
            return other instanceof LombokCanEqual.ColorPoint;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public int hashCode() {
            final int PRIME = 31;
            int result = 1;
            result = result * PRIME + super.hashCode();
            final java.lang.Object $color = this.color;
            result = result * PRIME + ($color == null ? 0 : $color.hashCode());
            return result;
        }
    }

    /**
     * Handwritten leaf node to achive 100% coverage.
     *
     * Without this, the canEqual == false branch in ColorPoint will not be reached.
     */
    public static final class EndPoint extends ColorPoint {
        public EndPoint(int x, int y, Color color) {
            super(x, y, color);
        }

        @Override
        public boolean canEqual(Object other) {
            return false;
        }
    }

}