import { render, screen } from '@testing-library/react';
import History from './History';

test('renders learn react link', () => {
  render(<History />);
  const linkElement = screen.getByText(/learn react/i);
  expect(linkElement).toBeInTheDocument();
});
